package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//�÷��̾��� �������� ��������
public class KeyBoard extends KeyAdapter{
	
	Player player;
	
	public KeyBoard(Player player) {
		this.player=player;
	}
	//Ű���� ������
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		switch (key) { //�Ұ�ȣ���� ���� ���� ������ �������ٴ�
		case KeyEvent.VK_UP:
			 player.velY=-2;
			break;
		case KeyEvent.VK_LEFT:
			player.velX=-2;
			break;
		case KeyEvent.VK_RIGHT:
			player.velX=2;
			break;	
		case KeyEvent.VK_DOWN:
			player.velY=2;
			break;
		case KeyEvent.VK_SPACE:
			//�Ѿ˻���
			new Bullet(player.x,player.y, 5, 5);
			break;
		default:
			break;
		}
	}
	//https://github.com/kbh0581/projectGame.git
	//Ű���� ����
	public void keyReleased(KeyEvent e) {
		
		int key=e.getKeyCode();
		switch (key) { //�Ұ�ȣ���� ���� ���� ������ �������ٴ�
		case KeyEvent.VK_UP:
			 player.velY=0;
			break;
		case KeyEvent.VK_LEFT:
			player.velX=0;
			break;
		case KeyEvent.VK_RIGHT:
			player.velX=0;
			break;	
		case KeyEvent.VK_DOWN:
			player.velY=0;
			break;
		default:
			break;
		  }
		}
	}