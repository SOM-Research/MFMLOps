# MFMLOps

A framework for modeling ML-based software development processes.

The framework provides a graphical tool for process modelers to design their own AI/ML development processes, which includes assets for representing activities, artifacts, resources and roles. Those entities have been identified and designed from a literature review on best and actual practices.

We have built our framework on top of the [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/emf/).

Additional features have been included, such as:
- A BPMN exporter that converts the process model into a BPMN 2.0 compliant file that can be run by any compatible business process automation platform.
- An HTML documentation generator that creates a single navigable document including all the information extracted from the different entities within a process model.

## Installation

The MFMLOps graphical modeler can be installed from its Update Site, using the following URL: [https://som-research.github.io/MFMLOps/updates/](https://som-research.github.io/MFMLOps/updates/)

## Repository structure

The following are the repository's relevant sections:

- The *dsl4ai* folder contains the source code of the meta-model in which the grapchical modeler is based on.
- The *dsl4ai.converter* folder contains the source code of both the BPMN exporter and the HTML documentatio generator.
- The *examples* folder contains outputs based on the [Microsoft Team Data Science Process](https://learn.microsoft.com/en-us/azure/architecture/data-science-process/overview). Namely: a process model built with the MFMLOps graphical modeler, a BPMN 2.0 file for enacting the process on any compatible BPM suite, and an HTML documentation file to browse the contents and descriptions of the process elements.

```
├── edu.uoc.som.dsl4ai.TDSP                     // The source code of the TDSP modeled process using the graphical modeler
├── edu.uoc.som.dsl4ai.converter                // The source code of the converter project, implemented in Acceleo
├── edu.uoc.som.dsl4ai.design                   // The designer code of the graphical modeler, including the views' definitions
├── edu.uoc.som.dsl4ai.edit                     // Code generated from the meta-model in which the designer is based on
├── edu.uoc.som.dsl4ai.editor                   // Code generated from the meta-model in which the designer is based on
├── edu.uoc.som.dsl4ai.feature                  // Feature for the Eclipse update sites
├── edu.uoc.som.dsl4ai                          // Meta-model of the graphical modeler
└── examples
      ├── TDSP process
      ├── generatedTDSPBPMNProcessModel.bpmn    // The generated BPMN 2.0 file from the TDSP modeled process
      └── generatedTDSPHTMLDocumentation.html   // The generated HTML documentation navigable file from the TDSP modeled process  
```

## License

The source code for the site is licensed under the Eclipse Public License - v 2.0, which you can find in the LICENSE file.
