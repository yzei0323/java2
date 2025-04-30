package day5Prac.스택큐;

import java.util.PriorityQueue;
import java.util.Queue;

class Game implements Comparable<Game>{
	String name;
	int price;
	
	
	public Game(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Game o) {
		// TODO Auto-generated method stub
		//return this.price - o.price;	//기준이 클 때 양수가 전달 (기준이 클 때 자리 교환이 일어남, 오름차순)
		return o.price - this.price; 	//기준이 작을 때 양수가 전달 (내림차순
	}
	
}

public class 우선순위큐문제 {

	public static void main(String[] args) {
		
		//우선순위큐 사용하기
		Queue<Game> q = new PriorityQueue<>();
		
		q.offer(new Game("미칠듯이재밌는게임", 100000));
		q.offer(new Game("개재밌는게임", 20000));
		q.offer(new Game("재밌는게임", 2000));
		q.offer(new Game("장난아닌게임", 80000));
		q.offer(new Game("별로인게임", 100));
		
		//
		while(!q.isEmpty()) {
		
			Game game = q.poll();
			System.out.println(game);
		
		}

	}

}
