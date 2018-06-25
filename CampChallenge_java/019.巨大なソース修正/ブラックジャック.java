package blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Human抽象クラス
 */
abstract class Human
{
	protected ArrayList<Integer> myCards = new ArrayList<Integer>();	///<自分の手札

	/**
	 * @brief カードを手札に追加
	 * @param[in] cards 手札に追加するカード
	 */
	public abstract void setCard(ArrayList<Integer> cards);

	/**
	 * @brief カードを合計値を求める
	 * @return カードを合計値
	 */
	public abstract int open();

	/**
	 * @brief カードを引くべきかを判定
	 * @return カードを引くべきか
	 */
	public abstract boolean checkSum();

	/**
	 * @brief 手札をコンソールに出力
	 */
	public abstract void print();

	/**
	 * @brief カードの絵柄を求める
	 * @param[in] card カードの種類(0〜51)
	 * @return カードを絵柄(0〜3)
	 */
	protected int getSuit(int card)
	{
		return card / 13;
	}

	/**
	 * @brief カードの数字を求める
	 * @param[in] card カードの種類(0〜51)
	 * @return カードを数字(0〜12)
	 */
	protected int getNumber(int card)
	{
		return card % 13;
	}

	/**
	 * @brief ブラックジャックでのカードの強さを求める
	 * @param[in] card カードの種類(0〜51)
	 * @return カードを数字(1〜10)
	 */
	protected int getPower(int card)
	{
		int power = getNumber(card)+1;
		if(power >= 10){
			//T〜Kは一律10として扱う
			power = 10;
		}
		return power;
	}

	/**
	 * @brief カード名を求める
	 * @param[in] card カードの種類(0〜51)
	 * @return カード名
	 */
	protected String getName(int card)
	{
		String name = "";
		int suit = this.getSuit(card);
		switch(suit){
			case 0://スペード
				name += "S";
				break;
			case 1://クラブ
				name += "C";
				break;
			case 2://ダイヤ
				name += "D";
				break;
			case 3://ハート
				name += "H";
				break;
			default://謎
				assert false;
		}
		int num = this.getNumber(card);
		switch(num){
			case 0://A
				name += "A";
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				name += num+1;
				break;
			case 9://10
				name += "T";
				break;
			case 10://J
				name += "J";
				break;
			case 11://Q
				name += "Q";
				break;
			case 12://K
				name += "K";
				break;
			default://謎
				assert false;
		}
		return name;
	}
}

/**
 * プレイヤークラス
 */
class User extends Human
{
	/**
	 * @brief カードを手札に追加
	 * @param[in] cards 手札に追加するカード
	 */
	@Override
	public void setCard(ArrayList<Integer> cards)
	{
		this.myCards.addAll(cards);
	}

	/**
	 * @brief カードを合計値を求める
	 * @return カードを合計値
	 */
	public int open()
	{
		int sum = 0;
		for(int card : this.myCards){
			sum += this.getPower(card);
		}
		return sum;
	}

	/**
	 * @brief カードを引くべきかを判定
	 * @return カードを引くべきか
	 */
	@Override
	public boolean checkSum()
	{
		return (this.open() <= 16);
	}

	/**
	 * @brief 手札をコンソールに出力
	 */
	@Override
	public void print()
	{
		System.out.print("USER: ");
		for(int card : this.myCards){
			System.out.print(this.getName(card));
			System.out.print(" ");
		}
		System.out.print("¥n");
	}
}

/**
 * ディーラークラス
 */
class Dealer extends Human
{
	private ArrayList<Integer> cards = new ArrayList<Integer>();	///<山札

	/**
	 * @brief コンストラクタ
	 */
	public Dealer()
	{
		for(int i=0; i<52; ++i){
			cards.add(i);
		}
		Collections.shuffle(cards);
	}

	/**
	 * @brief 山札からカードを2枚引く
	 @ return 引かれたカード配列
	 */
	public ArrayList<Integer> deal()
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<2; ++i){
			result.add(internalHit());
		}
                return result;
	}

	/**
	 * @brief 山札からカードを1枚引く
	 @ return 引かれたカード配列
	 */
	public ArrayList<Integer> hit()
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(internalHit());
                return result;
	}

	/**
	 * @brief 山札からカードを1枚引く(内部用)
	 @ return 引かれたカード
	 */
	private int internalHit()
	{
		int result = this.cards.get(0);
		this.cards.remove(0);
		return result;
	}

	/**
	 * @brief カードを手札に追加
	 * @param[in] cards 手札に追加するカード
	 */
	@Override
	public void setCard(ArrayList<Integer> cards)
	{
		this.myCards.addAll(cards);
	}

	/**
	 * @brief カードを合計値を求める
	 * @return カードを合計値
	 */
	public int open()
	{
		int sum = 0;
		for(int card : this.myCards){
			sum += this.getPower(card);
		}
		return sum;
	}

	/**
	 * @brief カードを引くべきかを判定
	 * @return カードを引くべきか
	 */
	@Override
	public boolean checkSum()
	{
		return (this.open() <= 16);
	}

	/**
	 * @brief 手札をコンソールに出力
	 */
	@Override
	public void print()
	{
		System.out.print("DEALER: ");
		for(int card : this.myCards){
			System.out.print(this.getName(card));
			System.out.print(" ");
		}
		System.out.print("¥n");
	}
}


/**
 * メインエントリクラス
 */
class Blackjack
{
	/**
	 * @brief メイン関数
	 * @param[in] args コマンドライン引数
	 */
	public static void main(String args[])
	{
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
		}

		int dealerSum = dealer.open();
		int userSum = user.open();
		if(dealerSum > 21 || userSum > dealerSum){
			//ディーラーがバーストしたか、ユーザーの合計がディーラーよりでかければユーザーの勝利
			System.out.println("USER WIN");
		}else{
			//それ以外はディーラーの勝利
			System.out.println("DEALER WIN");
		}
	}
}
