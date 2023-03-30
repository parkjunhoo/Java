package api.lang;

public class Prob3 {
	public static void main(String[] args) {
		Prob3 p = new Prob3();
		String addr = "서울특별시,강남구,언주로,멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for (int i = 0; i < addrArr.length; i++) {
			System.out.print(addrArr[i] + " ");
		}
		System.out.println();
		System.out.println("================");

		String addr2 = "서울특별시,강남구,언주로,멀티캠퍼스,asd,we,234";
		String[] addrArr2 = p.split(addr2, ',');
		System.out.println("배열 크기 : " + addrArr2.length);
		for (int i = 0; i < addrArr2.length; i++) {
			System.out.print(addrArr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("================");
		String addr3 = "서울특별시,,,";
		String[] addrArr3 = p.split(addr3, ',');
		System.out.println("배열 크기 : " + addrArr3.length);
		for (int i = 0; i < addrArr3.length; i++) {
			System.out.print(addrArr3[i] + " ");
		}
	}

	public String[] split(String str, char separator) {
		//문자열 파싱을 위한 CharArr
		char[] charArr = str.toCharArray();
		
		//구분자를 만나기전 문자열을 기록하기 위한 buff
		String buff = "";
		//buff들을 담아두기 위한 buffArr 기본 크기는 5
		String[] buffArr = new String[5];
		//buff의 갯수를 담을 count
		int count = 0;
		//빈 문자열을 거르기 위한 플래그
		boolean isSeparatorBefore = false;
		
		for(char c : charArr) {
			
			if(c != separator) {
				//구분자를 만나기전에는 buff에 누적
				isSeparatorBefore = false;
				buff += c;
			}else {
				
				//이전에 구분자를 만났는데 또 구분자를 만났다 => 빈문자열 => 스킵
				if(isSeparatorBefore) {
					continue;
				}
				isSeparatorBefore = true;
				
				//버퍼어레이의 기본사이즈보다 버퍼갯수가 크면 버퍼 어레이 갯수를 증가
				if(buffArr.length-1 < count) {
					buffArr = sizeUp(buffArr);
				}
				//구분자를 만나면 buffArr에 담고
				//buff 초기화
				//buff갯수 +1
				buffArr[count] = buff;
				buff = "";
				count++;
			}
		}
		
		//남은 buff를 buffArr에 기록
		if(buff.length() > 0) {
			//버퍼어레이의 기본사이즈보다 버퍼갯수가 크면 버퍼 어레이 갯수를 증가
			if(buffArr.length-1 < count) {
				buffArr = sizeUp(buffArr);
			}
			buffArr[count] = buff;
			count++;
		}
		
		
		String[] result = new String[count];
		System.arraycopy(buffArr, 0, result, 0, count);
		return result;
		
	}
	
	//사이즈가 1 더 큰 배열 반환
	public String[] sizeUp(String[] arr) {
		String[] sizeUpArr = new String[arr.length+1];
		System.arraycopy(arr, 0, sizeUpArr, 0, arr.length);
		
		return sizeUpArr;
	}
}
