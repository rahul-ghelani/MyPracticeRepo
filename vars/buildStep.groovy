def checkout(branch, gitRepoPath) {
	checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: "*/${branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "${gitRepoPath}"]]]
}

def copyArtifacts(filter, flatten, projectName, selector, target) {
	copyArtifacts filter: "'${filter}'", flatten: "${flatten}", projectName: "'${projectName}'", selector: "${selector}", target: "'${target}'"
}