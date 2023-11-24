package my_project;

import java.util.*;

public class Game01 {
	
	static int count_v = 0;
	static int count_l = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("이름을 입력해주세요 : ");
		String name = scanner.nextLine();
		// 선수 입장
		
Main :  while(true) {
		System.out.println("<<<< 게임을 시작합니다 >>>>");
		Fighter user = new Fighter(name, 100);
		Fighter computer = new Fighter("컴퓨터", 100);
 Sub :	for(;;) {
	 		System.out.println("============================");
			System.out.print("1.공격 2.방어 3.에너지 충전 > ");
			int input = Integer.parseInt(scanner.nextLine());
			
			switch(input) {
			case 1: 
				System.out.println("============================");
				if(user.energy < 30) {
					System.out.println("에너지가 부족합니다! 다시 선택해 주세요");
					break;
				} else {
					int num = (int)(Math.random()*2+0.6);
					if(0<= num && num < 1) {
						System.out.printf("[%s]의 공격, ", computer.name);
						computer.defence = false;
					}else if(1 <= num && num < 2) {
						System.out.printf("[%s]의 방어", computer.name);
						computer.defence = true;
					}else {
						System.out.printf("[%s]의 미스", computer.name);
						computer.defence = false;
						user.hp += 20;
					}
					user.Attack(computer);
				}
				break;
			case 2:
				System.out.println("============================");
				if(user.energy < 10) {
					System.out.println("에너지가 부족합니다! 다시 선택해주세요");
					break;
				} else {
					int num = (int)(Math.random()*2);
					if(0<= num && num < 1) {
						System.out.printf("[%s]의 공격, ", computer.name);
						computer.defence = false;
					}else if(1 <= num) {
						System.out.printf("[%s]의 방어", computer.name);
						computer.defence = true;
					}
					user.Defence(computer);
				}
				break;
			case 3:	
				System.out.println("============================");
				if(user.energy == user.energy_max) {
					System.out.println("에너지 과부하 hp-30");
					user.hp -=30;
					break;
				}else {
					user.Heal();
					int num = (int)(Math.random()*2-0.3);
					if(0<= num && num < 1) {
						System.out.printf("[%s]의 공격, ", computer.name);
						user.hp -= 20;
						System.out.printf(" -> %s의 체력: %d\t %s의 체력: %d\n", user.name, user.hp, computer.name, computer.hp);
						System.out.printf(">>>>남은 에너지 : [%s]\n", user.energy);
					}else if( 1 <= num) {
						System.out.printf("[%s]의 회피", user.name);
						System.out.printf(" -> %s의 체력: %d\t %s의 체력: %d\n", user.name, user.hp, computer.name, computer.hp);
						System.out.printf(">>>>남은 에너지 : [%s]\n", user.energy);
						computer.defence = true;
					}
				}
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
			
			if(user.hp <= 0) {
				count_l += 1;
				System.out.printf("패배했습니다. [ %d승 %d패 ]\n", count_v, count_l);
				System.out.println("다시 도전하시겠습니까? 1:네 2:아니오 >");
				int re = Integer.parseInt(scanner.nextLine());
				if (re == 1) {
					break Sub;
				} else if( re == 2) {
					System.out.println("게임을 종료합니다.");
					break Main;
				}
			}else if(computer.hp <= 0) {
				count_v += 1;
				System.out.println("*********************************");
				System.out.printf("승리했습니다. [ %d승 %d패 ]\n", count_v, count_l);
				System.out.println("*********************************");
				System.out.println("다시 도전하시겠습니까? 1:네 2:아니오 >");
				int re = Integer.parseInt(scanner.nextLine());
				if (re == 1) {
					break Sub;
				} else if( re == 2) {
					System.out.println("게임을 종료합니다.");
					break Main;
			}
			}
			
		}
		
		}
	}

}
