import java.util.Scanner;

public class Port01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu1 = "아아";
        int price1 = 2500;

        String menu2 = "수박";
        int price2 = 2400;

        String menu3 = "초코";
        int price3 = 6500;

        String menu4 = "토마토";
        int price4 = 3000;

        //String finish = "종료"; //종료버튼

        int add; //관리자 모드,커스텀,종료

        String newm = ""; //신규 메뉴추가,기존가격변경
        int newp = 0;

        int newnum; //추가메뉴창 입력번호

        int choice; //손님 모드

        String changem = "";
        int changep = 0;

        while(true) {
            System.out.println("1. 관리자모드");
            System.out.println("2. customer모드");
            System.out.println("3. 프로그램종료");

            int m = scan.nextInt();


            if(m==1) {
                System.out.println("1. 메뉴 신규추가 ");
                System.out.println("2. 기존메뉴 가격변경");

                add = scan.nextInt();

                while(true) {
                    if(add==1) {
                        System.out.println("추가할 메뉴입력 >> ");
                        System.out.println("1. 신규메뉴 이름 : ");
                        System.out.println("2. 신규메뉴 가격 : ");
                        System.out.println("3. -----종료-----");

                        newm = scan.next();
                        newp = scan.nextInt();

                        if(newm.equals(menu1)) {
                            System.out.println("이미있는 메뉴입니다. ");
                        }
                        else if(newm.equals(menu2)) {
                            System.out.println("이미있는 메뉴입니다. ");
                        }
                        else if(newm.equals(menu3)) {
                            System.out.println("이미있는 메뉴입니다. ");
                        }
                        else if(newm.equals(menu4)) {
                            System.out.println("이미있는 메뉴입니다. ");
                        }
                        else {
                            System.out.println("신규메뉴 이름 : " + newm + "  // 신규메뉴 가격 : " + newp);
                            System.out.println("--신규메뉴 추가완료--");
                            System.out.println("-----실행종료-----");
                            break;
                        }
                        //깔끔하지않음..다이렉트 연결방법 알아보기
                        if(newp==3) {
                            System.out.println("-----실행종료-----");
                            break;
                        }
                    }//if add1 끝

                    if(add==2) {
                        System.out.println("기존메뉴 가격변경 >> ");
                        System.out.println("1. 변경할 메뉴이름 : ");
                        System.out.println("2. 새로운 가격 : ");

                        changem = scan.next();
                        changep = scan.nextInt();

                        if(changem.equals(menu1)) {
                            System.out.println("메뉴이름 : " + changem + "  // 변경된 가격 : " + changep);
                            System.out.println("--신규메뉴 추가완료--");
                            break;
                        }
                        else if(newm.equals(menu2)) {
                            System.out.println("메뉴이름 : " + changem + "  // 변경된 가격 : " + changep);
                            System.out.println("--신규메뉴 추가완료--");
                            break;
                        }
                        else if(newm.equals(menu3)) {
                            System.out.println("메뉴이름 : " + changem + "  // 변경된 가격 : " + changep);
                            System.out.println("--신규메뉴 추가완료--");
                            break;
                        }
                        else if(newm.equals(menu4)) {
                            System.out.println("메뉴이름 : " + changem + "  // 변경된 가격 : " + changep);
                            System.out.println("--신규메뉴 추가완료--");
                            break;
                        }
                        else {
                            System.out.println("찾으시는 메뉴가 없습니다.");
                            System.out.println("-----실행종료-----");
                            break;
                        }
                        //if(changep==3) {
                        //System.out.println("-----실행종료-----");
                        //break;
                        //}

                    }//if add2 끝
                } //while 끝
            }//if m=1 끝

            //손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드
            //손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드
            //손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드손님모드
            else if(m==2) {
                System.out.println("-------메뉴판-------");
                System.out.println(">> 1. " + menu1);
                System.out.println(">> 2. " + menu2);
                System.out.println(">> 3. " + menu3);
                System.out.println(">> 4. " + menu4);
                System.out.println("메뉴번호를 선택해주세요 : ");

                choice = scan.nextInt();

                while(true) {
                    if(choice==1) {
                        System.out.println("아이스 아메리카노(2500원)을 선택하셨습니다 맞으면 yes, 아니면 no를 입력해주세요. ");
                        String test = scan.next();

                        if(test.equals("yes")) {
                            System.out.println("--주문의 완료되었습니다.--");
                            break;
                        }
                        else if(test.equals("no")) {
                            System.out.println("--주문에 실패하였습니다. 다시 시도해주세요--");
                            break;
                        }
                    }
                }

            }	//else if 끝 손님모드끝
            else { System.out.println("3. 프로그램종료");
                break;
            }	 //else 끝 프로그램종료끝

        }	//While 관리자모드, customer모드,프로그램종료 끝
    }	// public static void main(String[] args)
} 	//public class Port01
