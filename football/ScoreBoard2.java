package football;

public class ScoreBoard2 implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("ScoreBorad2 is updated to " +((HeadQuater)o).getscore());
    }
}
