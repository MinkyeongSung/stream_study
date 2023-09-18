package shop.metacoding.stream_study.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamEx01Test {

    @Test
    public void ex04answer() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();
        // 1. list -> newList에 깊은 복사하기
        for (Integer t : list) {
            newList.add(t);
        }
        // 2. newList에서 동일한 값 제거하기
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i) == newList.get(j)) {
                    System.out.print("i값 : " + newList.get(i) + ", ");
                    System.out.print("j값 : " + newList.get(j));
                    System.out.println();
                    newList.remove(j);
                }
            }
        }
        // 3. 값 출력하기
        for (Integer i : newList) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void ex04() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();

        List<Integer> newList2 = new ArrayList<>();

        // 깊은 복사
        for (Integer i : list) {
            newList.add(i);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < newList.size() - 1; j++) {
                if (list.get(i) != newList.get(j)) {
                    System.out.println("list 열의 값은 이렇게 나와요 : " + list.get(i));
                    System.out.println("newList 열의 값은 이렇게 나와요 : " + newList.get(j));
                    newList2.add(newList.get(j));
                    newList.remove(newList.get(j));

                }
            }

        }

        for (Integer integer : newList2) {
            System.out.print(integer);
        }

        System.out.println();

    }

    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> lowList = new ArrayList<>();
        List<Integer> highList = new ArrayList<>();

        // 얕은 복사
        lowList = list;

        // 깊은 복사
        for (Integer i : list) {
            highList.add(i);
        }
    }

    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        Stream<Integer> stream = list.stream();

        stream.distinct().forEach(t -> {
            System.out.print(t + " ");
        });

    }

    @Test
    public void ex01() {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        Stream<Integer> stream = list.stream();

        // 익명클래스
        stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });

        // 기본람다식
        // stream.forEach(t -> {
        // System.out.println(" 값 : " + t);
        // });

    }
}
