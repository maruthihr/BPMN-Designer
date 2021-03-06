/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.common.util.EList;
import org.obeonetwork.dsl.bpmn2.DataInput;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InputOutputSpecificationValidator {
	boolean validate();

	boolean validateInputSets(EList<InputSet> value);

	boolean validateOutputSets(EList<OutputSet> value);

	boolean validateDataInputs(EList<DataInput> value);

	boolean validateDataOutputs(EList<DataOutput> value);
}
