package my_project;

public class Fighter {
	String name;
	boolean defence;
	int hp;
	int hp_max = 100;
	int energy = 100;
	int energy_max = 100;
	int energy_min = 0;
	
	Fighter(String s, int i) {
		name = s;
		hp = i;
		
	}
	
	void Heal() { 
		if(energy + 50 >= energy_max) {
			energy = energy_max;
			if (hp + 10 >= hp_max) {
				hp = hp_max;
				System.out.printf("[%s]의 체력+ 10, 에너지 + 50\n", name);
			}else {
				hp += 10;
				System.out.printf("[%s]의 체력+ 10, 에너지 + 50\n", name);
			}
		}else {
			energy = energy + 50;
			System.out.printf("[%s]의 에너지 + 50\n", name);
		}
	}
	
	void Attack(Fighter enemy) {
		energy -= 30;
		System.out.printf("[%s]의 공격!\n", name);
		if(enemy.defence == true) {
			System.out.printf("[%s]의 방어 성공!",enemy.name);
			System.out.printf(" -> %s의 체력: %d\t %s의 체력: %d\n", name, hp, enemy.name, enemy.hp);
			System.out.printf(">>>>남은 에너지 : [%s]\n", energy);
		} else {
			hp -= 20;
			enemy.hp -= 20;
			System.out.printf("[%s]의 공격 성공!",name);
			System.out.printf(" -> %s의 체력: %d\t %s의 체력: %d\n", name, hp, enemy.name, enemy.hp);
			System.out.printf(">>>>남은 에너지 : [%s]\n", energy);
		}
	}
		
	
	void Defence(Fighter enemy) {
		defence = true;
		energy -= 10;
		System.out.printf("[%s]의 방어!\n", name);
		if(enemy.defence) {
			hp -= 10;
			enemy.hp -= 10;
			System.out.printf("두 선수의 소극적인 플레이! (-10)");
			System.out.printf(" -> %s의 체력: %d\t %s의 체력: %d\n", name, hp, enemy.name, enemy.hp);
			System.out.printf(">>>>남은 에너지 : [%s]\n", energy);
		} else {
			System.out.printf("[%s]가 방어에 성공!", name);
			System.out.printf(" -> %s의 체력: %d\t %s의 체력: %d\n", name, hp, enemy.name, enemy.hp);
			System.out.printf(">>>>남은 에너지 : [%s]\n", energy);
		}
	}
	
}