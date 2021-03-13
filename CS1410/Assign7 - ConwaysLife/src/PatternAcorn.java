public class PatternAcorn extends Pattern{
    private boolean[][] pattern = {{false, true, false, false, false, false, false},
                                    {false, false, false, true, false, false, false},
                                    {true, true, false, false, true, true, true}};
    @Override
    public int getSizeX(){return this.pattern[0].length;};

    @Override
    public int getSizeY(){return this.pattern.length;};

    @Override
    public  boolean getCell(int x, int y) {
        if(x >= getSizeX()){return false;}
        return this.pattern[y][x];
    }
}