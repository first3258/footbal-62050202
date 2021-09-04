package football;

public class ScoreBorad implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("ScoreBorad is updated to " +((HeadQuater)o).getscore());
    }
}
