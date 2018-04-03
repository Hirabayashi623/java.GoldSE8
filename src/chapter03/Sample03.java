package chapter03;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sample03 {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(1);	queue.offer(2);	queue.offer(3); // offerLast
		System.out.println("toString: " + queue);

		// 先頭を取得
		System.out.println("peek: " + queue.peek());  //peekFirst
		System.out.println("toString: " + queue);

		// 先頭を取得＆削除
		System.out.println("poll: " + queue.poll()); // pollFirst
		System.out.println("toString: " + queue);

		// 先頭に挿入
		queue.offerFirst(0);
		System.out.println(queue);

		// 最後の要素を取得
		System.out.println("peekLast: " + queue.peekLast());

		// 最後の要素を取得＆削除
		System.out.println("pollLast: " + queue.pollLast());

		queue.clear();
		System.out.println(queue);

		// スタックとして利用
		queue.push(1); queue.push(2); queue.push(3);
		System.out.println(queue);
		System.out.println(queue.pop());
	}
}
