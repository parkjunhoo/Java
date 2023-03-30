package chap07.oop.polymorphism;

public class SNSSender extends Sender {
	int length;
	public SNSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send(){
		System.out.println(name+"전송이 완료 - 미리 등록한 본인의 SNS계정에 보내기 완료 ");
	}
}
