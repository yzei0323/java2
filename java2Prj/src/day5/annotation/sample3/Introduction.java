package day5.annotation.sample3;

 
public class Introduction {
    @Blind
    @MaxLength(4)
    private String name;
 
    private int age;

    @MaxLength   //기본값 10자리  , 애너테이션 default 값이 있는 경우는 생략 할 수 있음  ,  @MaxLength(10)
    private String job;

    @MaxLength(200)  // 200
    private String description;
    
    @WeekDaysAvail( { WeekDay.MON  ,  WeekDay.WED  , WeekDay.FRI})     //쉴 수 있는 요일 목록
    private WeekDay day;
    

    public Introduction(String name, int age, String job, String description , WeekDay day) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.day =day;
        this.description = description;
    }

     @TestAndPrint(before = "- - - 소개 시작합니다. - - -")
   // @TestAndPrint(after = "- - - 이상 간략 소개입니다. - - -")
    public void shortPrint () {
        System.out.printf(
                "%s (%d대 %s)%n",
                name, age, job
        );
    }

    public void fullPrint () {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 :   "+ name + "\n");
        sb.append("나이 :  " + age + "n");
        sb.append("직업 : " + job + "\n");
        sb.append(description);
        System.out.println(sb.toString());
    }
}