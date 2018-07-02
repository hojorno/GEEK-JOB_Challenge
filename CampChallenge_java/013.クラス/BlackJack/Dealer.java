package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Hojorno Giovanna
 */

/**
 *ディーラークラス
 */
class Dealer extends Human{
    
    protected ArrayList<Integer> cards = new ArrayList<Integer>();  //山札
    
    /**
     * @brief コンストラクタ
     */   
    public Dealer(){
    
        
        for (int i = 0; i < 52; i++) {
            this.cards.add(i);
        }
        Collections.shuffle(this.cards);
    }
    
    /**
     * @brief 山札からカードを2枚引く
     * @return 引かれたカード配列
     */
    public ArrayList<Integer> deal(){
   
        ArrayList<Integer> result = new ArrayList<Integer>();
                
        for (int i = 0; i < 2; i++) {
            result.add(this.cards.get(0));
            this.cards.remove(0);
        }
        return result;
    }
    
        /**
	 * @brief 山札からカードを1枚引く
	 * @return 引かれたカード
	 */
    public ArrayList<Integer> hit(){
        
        ArrayList<Integer> result = new ArrayList<Integer>();
                
        result.add(this.cards.get(0));
        this.cards.remove(0);
        
        return result; 
    }
    
    /**
     * @brief カードを手札に追加
     * @param[in] set 手札に追加するカード
     */
    public void setCard(ArrayList<Integer> set){
    
        this.myCards.addAll(set);
    }
   
    /**
     * @brief カードを合計値を求める
     * @return カードを合計値
     */
    public int open(){
        //合計値=sum
        int sum=0;
        
        for (int i = 0; i < this.myCards.size(); i++) {
            
            int card = this.myCards.get(i);
            int num = (card %13) +1;
            
            if (num >= 10) {
                num =10;
            } 
            sum += num;
        }
        return sum;
    }
    
    /**
     * @brief カードを引くべきかを判定
     * @return カードを引くべきか
     */
    public boolean checkSum(){
        
        int sum = this.open();
        
        if (sum <= 16) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * @brief 手札をコンソールに出力
     */
    public void print(){
    
        System.out.print("DEALER: ");

        for (int i = 0; i< this.myCards.size() ; i++) {
            System.out.print(this.myCards.get(i)%13+1);
            System.out.print("  ");
        }
    }
}
