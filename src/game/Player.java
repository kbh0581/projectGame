/*
 * 이 클래스는 sun 에서 자체 제작한 UI컴포넌트가 아니기 때문에 화면에 그려질 수 없다..
 * 따라서 JPanel 에 그려지려면 JPanel의 Graphics 의 레퍼런스를 이객체가 보유해야한다
 * */

package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Player extends GameObject{

	
	
	public Player(ObjectManager obj,ObjectId id,int x,int y,int width,int height){
		super(obj,id,x,y,width,height);
		
		
		
	}
	
	//총알 발사 행위를 정의한다!1
	public void fire(){
		Bullet bullet =new Bullet(objectManager,ObjectId.Bullet,x, y, 10, 10);
		objectManager.addObject(bullet);
	}
	
	
	//x,y,w,h등의 물리량 드으이 변화를 제어하기 위한 메서드!!
	//사람 비유-운동량변화 
	public void tick(){
		x+=velX;
		y+=velY;
		
		//사강형이 나가를 따라다니게
		rect.setBounds(x, y, width, height);
	}
	
	//변화된 값을 화면에 그려지게 할 메서드!!
	public void render(Graphics g){
		g.setColor(Color.WHITE);//페인트 색 바꾸기
		//g.drawRect(x, y, width, height);
		Graphics2D g2=(Graphics2D)g;
		g2.draw(rect);
		
		
	}
}
