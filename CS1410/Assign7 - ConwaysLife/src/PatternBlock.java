public class PatternBlock extends Pattern{
    private boolean[][] pattern = {{true, true},
                                    {true, true}};
    @Override
    public int getSizeX(){return this.pattern[0].length;};

    @Override
    public int getSizeY(){return this.pattern.length;};

    @Override
    public  boolean getCell(int x, int y) {
        return this.pattern[y][x];
    }
}