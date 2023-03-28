# MFMLOps

A framework for modeling ML-based software development processes.

The framework provides a graphical tool for process modelers to design their own AI/ML development processes, which includes assets for representing activities, artifacts, resources and roles. Those entities have been identified and designed from a literature review on best and actual practices.

We have built our framework on top of the [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/emf/).

Additional features have been included, such as:
- A BPMN exporter that converts the process model into a BPMN 2.0 compliant file that can be run by any compatible business process automation platform.
- An HTML documentation generator that creates a single navigable document including all the information extracted from the different entities within a process model.

## Installation

### Requirements

- Eclipse SDK version 2023-03 (4.27)
- EMF - Eclipse Modeling Framework SDK version 2.33
- Sirius Properties Views - Runtime Support version 7.0.7
- Sirius Properties Views - Specifier Support version 7.0.7
- Sirius Specifier Environment version 7.0.7
- Acceleo version 3.7.12

### Installation of the Graphical Modeler

The MFMLOps graphical modeler can be installed from its Update Site, using the following URL: [https://som-research.github.io/MFMLOps/updates/](https://som-research.github.io/MFMLOps/updates/)

## Repository Structure

The following tree shows the list of the repository's sections:

```
├── edu.uoc.som.dsl4ai.TDSP                     // The source code of the TDSP modeled process using the graphical modeler
├── edu.uoc.som.dsl4ai.converter                // The source code of both the BPMN exporter and the HTML documentation generator, implemented in Acceleo
├── edu.uoc.som.dsl4ai.design                   // The designer code of the graphical modeler, including the views' definitions
├── edu.uoc.som.dsl4ai.edit                     // Code generated from the meta-model in which the designer is based on
├── edu.uoc.som.dsl4ai.editor                   // Code generated from the meta-model in which the designer is based on
├── edu.uoc.som.dsl4ai.feature                  // Feature for the Eclipse update sites
├── edu.uoc.som.dsl4ai                          // Meta-model of the graphical modeler (aka DSL4AI)
└── examples
      ├── TDSP process
      |     ├── TDSP.dsl4ai                     // Concrete syntax of the TDSP method based on the DSL4AI meta-model
      |     └── representations.aird            // XMI plug-in file with the visualization of the TDSP method activities and other elements
      ├── generatedTDSPBPMNProcessModel.bpmn    // The generated BPMN 2.0 file from the TDSP modeled process
      └── generatedTDSPHTMLDocumentation.html   // The generated HTML documentation navigable file from the TDSP modeled process  
```

### Examples

The *examples* folder contains outputs based on the [Microsoft Team Data Science Process](https://learn.microsoft.com/en-us/azure/architecture/data-science-process/overview). Namely:
- a TDSP process model built with the MFMLOps graphical modeler;
- a BPMN 2.0 file for enacting the process on any compatible BPM suite; and
- an HTML documentation file to browse the contents and descriptions of the process elements.

## Publications

- Morales, Sergio, Robert Clarisó, and Jordi Cabot. "Towards a DSL for AI Engineering Process Modeling." In Product-Focused Software Process Improvement: 23rd International Conference, PROFES 2022, Jyväskylä, Finland, November 21–23, 2022, Proceedings, pp. 53-60. Cham: Springer International Publishing, 2022. [https://doi.org/10.1007/978-3-031-21388-5_4](https://doi.org/10.1007/978-3-031-21388-5_4)

## License

The source code for the site is licensed under the Eclipse Public License - v 2.0, which you can find in the LICENSE file.
