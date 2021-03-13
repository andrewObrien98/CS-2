
public class LifeSimulator extends ConwaysLife{
    private int sizeX;
    private int sizeY;
    private boolean[][] world;

    LifeSimulator(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        createOriginal();
    }

    int getSizeX(){return this.sizeX;}

    int getSizeY(){return this.sizeY;}

    boolean getCell(int x, int y){
        if(x < (getSizeX() - 1) && x >= 0){
            if(y < (getSizeY() - 1) && y >= 0){
                return this.world[y][x];
            }
        }
        return false;
    }

    void insertPattern(Pattern pattern, int startX, int startY){
        //insert the pattern into the thing right here
        for(int i = 0; i < pattern.getSizeY(); i++){
            for(int j = 0; j < pattern.getSizeX(); j++){
                this.world[i + startY][j + startX] = pattern.getCell(j, i);
            }
        }


    }
    void update(){
        boolean[][] updateList = new boolean[getSizeY()][getSizeX()];
        for(int i = 0; i < getSizeY(); i++){
            for(int j = 0; j < getSizeX(); j++){
                if(getCell(j, i)){
                    int c = count(j, i);
                    if(c > 3 || c < 2){
                        updateList[i][j] = false;
                    }
                    else{updateList[i][j] = true;}
                }
                else{
                    int c = count(j,i);
                    if(c == 3){updateList[i][j] = true;}
                }
            }
        }
        this.world = updateList;

    }

    void createOriginal(){
        this.world = new boolean[getSizeY()][getSizeX()];
        for(int i = 0; i < getSizeY(); i++){
            for(int j = 0; j < getSizeX(); j++) {
                this.world[i][j] = false;
    }}}

    boolean[][] getWorld(){return this.world;}

    int count(int x, int y){
        int alive = 0;
        if(getCell(x-1, y-1)){alive++;}
        if(getCell(x, y-1)){alive++;}
        if(getCell(x+1, y-1)){alive++;}

        if(getCell(x-1, y)){alive++;}
        if(getCell(x+1, y)){alive++;}

        if(getCell(x-1, y+1)){alive++;}
        if(getCell(x, y+1)){alive++;}
        if(getCell(x+1, y+1)){alive++;}

        return alive;
    }

    void print(){
        for(int i = 0; i < this.world.length; i++){
            for(int j = 0; j < this.world[i].length; j++){
                System.out.printf("%b ", this.world[i][j]);
            }
            System.out.println();
        }
    }
}