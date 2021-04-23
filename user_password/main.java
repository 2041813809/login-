package user_password;
//已知用户名和密码，进行登录，输错账号超过三次则给出相应的提示

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int user = 123321;
        int password = 123456;

        for (int a = 1; a <= 6; a++) {

            Scanner anc = new Scanner(System.in);
            System.out.print("请输入用户名：");
            int User = anc.nextInt();

            System.out.print("请输入密码：");
            int Password = anc.nextInt();

            if (user == User && password == Password) {
                System.out.println("账号登录成功！");
                break;
            } else {
                System.out.println("用户名或者密码错误！");
                System.out.println("请重新登录！");
            }

            if (a == 3 ||a == 4) {
                System.out.println("提示：账号密码均为6位数！");
            }
            if (a == 5) {
                System.out.println("失败次数过多！该账户已被冻结！");
                break;
            }
        }
    }
}
