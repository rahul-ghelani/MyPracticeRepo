def workspace() {
	echo 'Cleaning Workspace'
	step([$class: 'WsCleanup'])
}