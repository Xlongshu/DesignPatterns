package longshu.designpatterns.interpreter;

// 测试
public class ExpressionTest {
	public static void main(String[] args) {
		String chineseNum = "六百三十七万八千二百零一";// 6378201
		Convertor convertor = new Convertor();
		System.out.println(chineseNum);
		System.out.println(convertor.convert(chineseNum));
		
		System.out.println(convertor.convert("五百万"));
	}
}