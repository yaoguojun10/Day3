package com.hsd.javaee.List;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.objects.XObject;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        User user1 = new User("张三","123");
        User user2 = new User("李四","456");
        User user3 = new User("王五","789");
        User user4 = new User("王朝","145");
        User user5 = new User("马汉","369");
        ArrayList<User> list= new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        boolean flag = false;
        A:for(int i=0;i<3;i++){
            System.out.println("请输入用户名和密码：");
            Scanner scanner = new Scanner(System.in);
            String  name= scanner.next();
            String pwd = scanner.next();
            B:for (User user : list) {
                if(name.equals(user.getUserName()) && pwd.equals(user.getPassWord())){
                    System.out.println("恭喜您，登录成功！");
                    flag = true;
                    break A;
                }
                else {
                    System.out.println("密码或用户名错误，请再次输入！");
                    break B;
                }
            }
        }
        if(!flag){
            System.out.println("对不起！输入次数过多，10分钟后再登录！");

        }

    }
}
