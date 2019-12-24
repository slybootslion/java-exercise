package d7;

public class Teacher {
    public void checkScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("输入的分数有误，不能大于100或小于0");
        } else {
            System.out.println("输入的分数正常");
        }
    }
}
