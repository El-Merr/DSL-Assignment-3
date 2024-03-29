/**
 * generated by Xtext 2.27.0
 */
package nl.tue.dsldesign.robot.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import nl.tue.dsldesign.robot.metamodel.Initial;
import nl.tue.dsldesign.robot.metamodel.Model;
import nl.tue.dsldesign.robot.metamodel.Robot;
import nl.tue.dsldesign.robot.metamodel.Step;
import nl.tue.dsldesign.robot.services.RobotGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class RobotFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RobotGrammarAccess _robotGrammarAccess;

  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Robot> _robots = model.getRobots();
    for (final Robot robot : _robots) {
      document.<Robot>format(robot);
    }
  }

  protected void _format(final Robot robot, @Extension final IFormattableDocument document) {
    document.<Initial>format(robot.getInitial());
    EList<Step> _steps = robot.getSteps();
    for (final Step step : _steps) {
      document.<Step>format(step);
    }
  }

  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof Robot) {
      _format((Robot)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
