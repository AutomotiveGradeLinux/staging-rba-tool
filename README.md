### 1. Requirement
Supported version is as followings.
- Eclipse: Oxygen.3a Release (4.7.3a)
- Xtend: 2.13.0.v20171020-0920
- Xtext: 2.13.0.v20171020-0920
- java: openjdk-8-jre-headless 

### 2. How to prepare Eclipse
#### 2-1. Download Eclipse Modeling Tools x86_64  
    https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-modeling-tools  

#### 2-2. Prepare the source code
    git clone https://git.automotivelinux.org/staging/rba-tool  

#### 2-3. Boot Eclipse
- Extract the zip, then boot eclipse.  


### 3. How to prepare Eclipse plugin  

#### 3-1. Download tmf-xtext-2.13
- Download Xtext 2.13.0 (2017/10/20) from the following site.  
    https://www.eclipse.org/modeling/tmf/downloads/index.php?showAll=1&hlbuild=R201710200920&project=xtext#R201710200920
- Extract the downloaded zip.  

#### 3-2. Install tmf-xtext-2.13
- Eclipse -> Help -> install new software -> Add -> Local
- Select the folder extracted from the zip on the step 2-1.  
- Set 'Local' to 'Name:' of 'Add Repository' dialog. Any name is OK.  Then, push 'OK'.
- After that, follow the sequence of the wizard, as for settings designated as bellow.
    - For 'Install Remediation Page' dialog, select the following.
        - 'Update my installation to be compatible with the items being installed.'  
    - For, the license term agreement, select the following.
        - 'I accept the terms of the license agreement'.

#### 3-3. Check the installed plugins
- Eclipse -> Help -> About Eclipse -> Installation Details
- Check that followings are present.
    - Xtend IDE 2.13.0.v20171020-0920 org.eclipse.xtend.sdk.feature.group Eclipse Xtend
    - Xtext Complete SDK 2.13.0.v20171020-0920 org.eclipse.xtext.sdk.feature.group Eclipse Xtext

### 4. How to build  
#### 4-1. Prepare to import
- File -> Import -> General -> 'Existing Projects into Workspace' -> Next  

#### 4-2. Designate the import target directory
- Set the rba-tool on the step 1-2. for 'Select root directory'.  
- Check 'Copy projects into workspace', then push 'Finish'.  

#### 4-3. Right click the following, and select 'Debug As -> MWE2Workflow'  
- rba.tool.editor -> src -> rba.tool.editor -> GenerateRBAModel.mwe2  
    
#### 4-4. Clean the entire workspace  
- Eclipse -> Project -> Clean  

#### 4-5. Auto-Build begins
- Wait until the processing messages disappears in the right bottom corner of Eclipse.  

### 5. How to export JSONGenerator.jar  
#### 5-1. Prepare the entry point
- Right click rba.tool.editor.endpoint  -> xtend-gen -> rba.tool.editor.endpoint -> ServerLauncher.java.  
- Click 'Run As' -> '1 Java Application'.  

#### 5-2. Begin the export settings
- Right click 'rba.tool.editor.endpoint'.  
- Export -> Java -> 'Runnable JAR file' -> Next  

#### 5-3. Fill out the export dialog
- Set 'ServerLauncher - rba.tool.editor.endpoint' for 'Launch confinguration'.  
- Set 'any_folder\JSONGenerator.jar' for 'Export destination'.  
- Set 'Copy required libraries into a sub-folder next to the generated JAR' for 'Library handling'.  

#### 5-4. Push the 'finish' button
- After 'finish' pushed, there is warning message as following, but ignore it.  
- 'JAR export finished with warnings. See details for additional information.'  

#### 5-5. Outputted file
- 'JSONGenerator_lib' and 'JSONGenerator.jar' is outputted to the folder designated on the step 5-3.  

### 6. Preparing the environment for execution  
#### 6-1. lib
- Copy rba.tool.editor.endpoint->lib to the folder in which 'JSONGenerator_lib' and 'JSONGenerator.jar' is contained.  

#### 6-2. script
- Copy rba.tool.editor.endpoint->script to the folder in which 'JSONGenerator_lib' and 'JSONGenerator.jar' is contained.  

#### 6-3. template
- Copy rba.tool.editor.endpoint->template to the folder in which 'JSONGenerator_lib' and 'JSONGenerator.jar' is contained.  

### 7. Usage  
- If some errors occur, RBAModel.json is not generated (exit code 1).  
````
java -cp ./ -jar JSONGenerator.jar "[path to model directory]" "[path to output directory]"
````

### 8. Example
- RBAModel.json file is generated in directory same as JSONGenerator.jar  
````
java -cp ./ -jar JSONGenerator.jar "./model"
````
- RBAModel.json file is generated in ~/ directory
````
java -cp ./ -jar JSONGenerator.jar "./model" "~/"
````
