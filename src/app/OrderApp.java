package app;

import app.product.Product;
import app.product.ProductRepository;


import java.util.Scanner;

public class OrderApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        System.out.println("\uD83C\uDF54 BurgerQueen Order Service");
        //while (true) {


            menu.printMenu();
            String input = scanner.nextLine();

            // 4
            //if (사용자 입력이 +인 경우) {
               // 주문 내역 출력
               // break;
           // }

            // 3
    //else if (사용자 입력이 0인 경우) {
               // 장바구니 출력
           // }

            // 2
   // else if (사용자 입력이 1부터 메뉴 마지막 번호에 해당하는 경우) {
               // 사용자가 고른 상품의 옵션을 보여주고 고르게 한 후, 장바구니에 담기
           // }
       // }
   // }


    }
}
