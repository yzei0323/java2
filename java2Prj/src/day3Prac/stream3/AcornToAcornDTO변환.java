package day3Prac.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AcornToAcornDTO변환 {

	public static void main(String[] args) {
		
		
		ArrayList<Acorn> list = new ArrayList<>();
		list.add(new Acorn("a001","박예린","1234"));
		list.add(new Acorn("a002","이정호","0000"));
		list.add(new Acorn("a003","김민환","4567"));
		list.add(new Acorn("a004","김유민","0808"));
		list.add(new Acorn("a005","박수경","0101"));
		list.add(new Acorn("a006","이수민","8383"));
		
		
		//Acorn 출력
		System.out.println("Acorn리스트 출력");
		list.forEach(item -> System.out.println(item));
		
		
		//
		System.out.println("AcornDTO로 출력");
		List<AcornDTO> dtoList = list.stream()
		.map(acorn -> new AcornDTO(acorn.getId(), acorn.getName()))
		.collect(Collectors.toList());
		
		dtoList.forEach( item -> System.out.println(item));
		
		
		list.stream()
		.map( acorn -> new AcornDTO(acorn.getId(), acorn.getName()))
		.collect(Collectors.toList());
	
		
	
	}
	
	

}
