

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class test17 {
	public static void main(String[] args) throws FindFailed, InterruptedException {

		Screen s = new Screen();
		// ファイル名を指定して実行
		s.type("r", Key.WIN);

		// https://www.google.co.jp とタイプ
		s.type("https://www.google.co.jp");

		// Enterを押す
		s.type(Key.ENTER);

		// 画面に「I'm Feeling Lucky」が出るまで最大10秒待つ
		s.waitText("I'm Feeling Lucky", 10);

		// テスト太郎 とペースト
		s.paste("テスト太郎");

		// 1秒待つ
		Thread.sleep(1000L);

		// 「I'm Feeling Lucky」をクリック
		s.click(s.findText("I'm Feeling Lucky"));

	}

}
