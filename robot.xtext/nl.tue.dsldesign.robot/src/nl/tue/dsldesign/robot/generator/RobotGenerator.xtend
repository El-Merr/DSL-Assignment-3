/*
 * generated by Xtext 2.27.0
 */
package nl.tue.dsldesign.robot.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import nl.tue.dsldesign.robot.metamodel.Robot
import nl.tue.dsldesign.robot.metamodel.Step
import nl.tue.dsldesign.robot.metamodel.Initial

//import org.eclipse.emf.ecore.util.EcoreUtil
//import org.eclipse.emf.common.util.URI

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RobotGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// resource.setURI('testModel.xmi')
//		String out = '';
		
		
		fsa.generateFile('testModel.txt','''
            «FOR robot : resource.allContents.filter(Robot).toIterable»
                <Robot>
                	«FOR step : robot.steps»
    	         		Step «step.direction»
    	            «ENDFOR»
                </Robot>
            «ENDFOR»
        '''
		)
	}
	
//	def compile(Robot robot) {
//		'''
//		
//		«FOR step : robot.allContents.filter(Step).toIterable»
//            Step «step.direction»
//        «ENDFOR»
//		'''
//	}


}
