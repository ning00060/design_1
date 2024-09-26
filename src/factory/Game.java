package factory;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // 팩토리 클래스를 선언하여 캐릭터를 생성할 준비를 합니다
        CharacterFactory characterFactory= new CharacterFactory();

        System.out.println("어떤 캐릭터를 선택하시겠습니까");

        Scanner sc = new Scanner(System.in);
        String choice= sc.nextLine();
        // **
        // 팩토리 패턴을 사용하지않으면, 클라이언트 측 입장에서 직접 if~else,switch 구문을 활용해서
        // 캐릭터생성 로직을 직접 구현 해야 합니다.
        // 그러나 팩토리 클래스를 활용하면 객체생성 로직을 팩토리 내부로 캡슐화 할수 있다.


        Character 나의캐릭터 = characterFactory.createCharacter(choice);
        if(나의캐릭터==null){
            System.out.println("해당캐릭터는 존재하지 않습니다");
            return;// 실행의 제어권 반납
        }

        // 선택된 캐릭터가 공격을 수행 합니다.
        나의캐릭터.attack();
    }
}
