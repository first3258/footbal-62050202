package football;

public class ScoreBoard1 implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("ScoreBorad1 is updated to " +((HeadQuater)o).getscore());
    }
}
