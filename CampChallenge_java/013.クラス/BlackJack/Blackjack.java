package BlackJack;

import java.util.ArrayList;

/**
 * @author Hojorno Giovanna
 */

/**
 * メインエントリクラス
 */
public class Blackjack{

    /**
     * @brief メイン関数
     */
    public static void main(String[] args){
        
        Dealer dealer = new Dealer();
        User user = new User();
        
	ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(dealer);
        humans.add(user);

        //最初に2枚配る
        for(Human human : humans){
            human.setCard(dealer.deal());
        }
          
        //もう引かなくなるか誰かがバーストするまで繰り返す
        boolean allHumanDone = false;
        boolean anyHumanBurst = false;
        while(allHumanDone == false && anyHumanBurst == false){
            
            allHumanDone = true;

            for(Human human : humans){
                if(human.checkSum() == false){
                    //もう引かない
                    continue;
                }
                

                human.setCard(dealer.hit());
                allHumanDone = false;

                if(human.open() > 21){
                    //バースト
                    anyHumanBurst = true;
                    break;
                }
            }
        }
        
	//結果の手札を表示
        for(Human human : humans){
            human.print();
            System.out.println("["+human.open()+"]");
        }

        int dealerSum = dealer.open();
        int userSum = user.open();
        //ユーザーがバーストした場合ディーラーの勝利        
        if(userSum > 21 ){
            System.out.println("DEALER WIN");
        //ディーラーがバーストしたか、ユーザーの合計がディーラーよりでかければユーザーの勝利   
        }else if (dealerSum > 21 || userSum > dealerSum) {
            System.out.println("USER WIN");
        //同スコアの場合は、ディーラーの勝利  
        }else{
            System.out.println("DEALER WIN");    
        }
    }
}


