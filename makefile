enzyme.apk: cell_lab_mod_v2/dist/cell_lab_mod_v2.apk
	zipalign -f 4 cell_lab_mod_v2/dist/cell_lab_mod_v2.apk enzyme.apk
	apksigner sign --ks enzyme.keystore --ks-pass file:pass.txt --v1-signing-enabled true --v2-signing-enabled true enzyme.apk
	@echo -e '\033[1;32mAPK built successfully!\033[0m'

cell_lab_mod_v2/dist/cell_lab_mod_v2.apk:
	apktool b cell_lab_mod_v2

.phony: new

new:
	apktool b cell_lab_mod_v2
	make
