import androidx.compose.ui.window.ComposeUIViewController
import org.camera.compose.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
