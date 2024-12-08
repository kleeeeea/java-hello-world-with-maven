package oop3.com.atguigu10._enum;

/**
 * ClassName: SeasonTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:13
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
//        Season.SPRING = null;

        System.out.println(Season.SPRING);

        System.out.println(Season.SUMMER.getSeasonName());
        System.out.println(Season.SUMMER.getSeasonDesc());
    }
}

//jdk5.0֮ǰ����ö����ķ�ʽ
class Season{
    //2. ������ǰ��Ķ����ʵ������,ʹ��private final����
    private final String seasonName;//���ڵ�����
    private final String seasonDesc;//���ڵ�����

    //1. ˽�л���Ĺ�����
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3. �ṩʵ��������get����
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4. ������ǰ���ʵ������Ҫʹ��public static final����
    public static final Season SPRING = new Season("����","��ů����");
    public static final Season SUMMER = new Season("����","��������");
    public static final Season AUTUMN = new Season("����","�����ˬ");
    public static final Season WINTER = new Season("����","��ѩ����");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
