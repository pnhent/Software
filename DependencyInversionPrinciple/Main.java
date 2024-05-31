public class Main 
{
    public static void main(String[] args) 
    {
        GameServer gameServer = new GameServer();
        gameServer.Game_Play(new SuperMario());
        gameServer.Game_Play(new Tetris());
        gameServer.Game_Play(new LOL());
        gameServer.Game_Play(new Racing());
    }
}
