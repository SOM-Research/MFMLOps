# Graphical Modeler Installation Guide

The MFMLOps graphical modeler has been built on top of the [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/emf/). These instructions assume you have already installed an Eclipse instance on your machine, version 2023-03 (4.27) or greater. Let's follow a step by step guide to fulfill the requirements, install the graphical modeler and setting up a first modeling project.

## Installing required plug-ins

The requirements for the graphical modeler are the following:
- EMF - Eclipse Modeling Framework SDK version 2.33
- Sirius version 7.0.7

Open an Eclipse instance and go to "Help / Install New Software...". In the drop-down "Work with:" select "2023-03 - https://download.eclipse.org/releases/2023-03".

Type "emf" in the finder bar and select:
- EMF - Eclipse Modeling Framework SDK version 2.33

<img
  src="https://github.com/SOM-Research/MFMLOps/blob/gh-pages/doc/imgs/InstallationGuide01.png?raw=true"
  alt="Selecting the EMF - Eclipse Modeling Framework SDK version 2.33"
  title="Selecting the EMF - Eclipse Modeling Framework SDK version 2.33"
  style="display: inline-block; margin: 0 auto">

Type "sirius" in the finder bar and select:
- Sirius Properties Views - Runtime Support version 7.0.7
- Sirius Properties Views - Specifier Support version 7.0.7
- Sirius Specifier Environment version 7.0.7

<img
  src="https://github.com/SOM-Research/MFMLOps/blob/gh-pages/doc/imgs/InstallationGuide02.png?raw=true"
  alt="Selecting the Sirius plug-ins"
  title="Selecting the Sirius plug-ins"
  style="display: inline-block; margin: 0 auto">

Now click "Next" and the following should appear:

<img
  src="https://github.com/SOM-Research/MFMLOps/blob/gh-pages/doc/imgs/InstallationGuide03.png?raw=true"
  alt="Selecting the Sirius plug-ins"
  title="Selecting the Sirius plug-ins"
  style="display: inline-block; margin: 0 auto">

Click "Next", accept the license agreements and click "Finish". Once the software is installed, restart Eclipse.

## Installing the graphical modeler

Open an Eclipse instance and go to "Help / Install New Software...". Click the "Add" button and enter "https://som-research.github.io/MFMLOps/updates/" in the "Location" textbox, then click "Add". The following should appear:

<img
  src="https://github.com/SOM-Research/MFMLOps/blob/gh-pages/doc/imgs/InstallationGuide04.png?raw=true"
  alt="Selecting the Sirius plug-ins"
  title="Selecting the Sirius plug-ins"
  style="display: inline-block; margin: 0 auto">

Select "edu.som.uoc.dsl4ai" and click "Next". Accept the license agreements, finish and trust unsigned content. Accept to restart Eclipse.

## Setting up a first modeling project

In order to create a new project, go to "File / New / Other..." and select "Sirius / Modeling Project". Click "Next" and assign a name to the project, then click "Finish".

Open the Sirius perspective. The project contents tree should be on the left side with the following contents:

<img
  src="https://github.com/SOM-Research/MFMLOps/blob/gh-pages/doc/imgs/InstallationGuide05.png?raw=true"
  alt="Selecting the Sirius plug-ins"
  title="Selecting the Sirius plug-ins"
  style="display: inline-block; margin: 0 auto">

Right-click the project name and select "New / Other...", then select "Example EMF Model Creation Wizards / Dsl4ai Model" and click "Next". Select the project folder as the parent and enter a name for the model (with extension .dsl4ai), then click "Next". Finally, select the "Method" entity as the Model Object and click "Finish".

The contents of the method are displayed on the screen. You are now able to create your model directly using this interface or, otherwise, might want to use the graphical tools. To do so, double-click the "representations.aird" file on the left. You should see the following:

<img
  src="https://github.com/SOM-Research/MFMLOps/blob/gh-pages/doc/imgs/InstallationGuide06.png?raw=true"
  alt="Selecting the Sirius plug-ins"
  title="Selecting the Sirius plug-ins"
  style="display: inline-block; margin: 0 auto">

Select "Enable" to be able to create specific views for the method and the different activities of the model. Select, for instance, the "Method Diagram" and click "New". Follow a few steps to create a new method diagram and then you will finally land in the MFMLOps graphical interface, with toolsets for designing your own AI/ML development process.
