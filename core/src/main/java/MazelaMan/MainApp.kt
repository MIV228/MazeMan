package MazelaMan

import com.badlogic.gdx.Game
import com.badlogic.gdx.utils.viewport.FitViewport

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class MainApp : Game() {



    override fun create() {
        setScreen(FirstScreen())
    }
}