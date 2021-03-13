public class PatternGlider extends Pattern{
    private boolean[][] pattern = {{false, false, true},
                                    {true, false, true},
                                    {false, true, true}};
    @Override
    public int getSizeX(){return this.pattern[0].length;};

    @Override
    public int getSizeY(){return this.pattern.length;};

    @Override
    public  boolean getCell(int x, int y) {
        return this.pattern[y][x];
    }
}