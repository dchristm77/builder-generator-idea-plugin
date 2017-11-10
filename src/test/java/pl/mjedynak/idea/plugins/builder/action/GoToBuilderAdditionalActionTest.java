package pl.mjedynak.idea.plugins.builder.action;

import com.intellij.openapi.util.IconLoader;
import org.junit.Before;
import org.junit.Test;

import javax.swing.Icon;

import static org.assertj.core.api.Assertions.assertThat;

public class GoToBuilderAdditionalActionTest {

    private static final String TEXT = "Go to builder...";
    private static final Icon ICON = IconLoader.getIcon("/actions/intentionBulb.png");

    private GoToBuilderAdditionalAction action;

    @Before
    public void setUp() {
        action = new GoToBuilderAdditionalAction();
    }

    @Test
    public void shouldGetItsOwnText() {
        // when
        String result = action.getText();

        // then
        assertThat(result).isEqualTo(TEXT);
    }

    @Test
    public void shouldGetItsOwnIcon() {
        // when
        Icon result = action.getIcon();

        // then
        assertThat(result).isEqualTo(ICON);
    }

    @Test
    public void shouldDoNothingWhenInvokingExecute() {
        // this test has no assertion. Is it really useful, if so it needs rework.
        // when
        action.execute();
    }
}
