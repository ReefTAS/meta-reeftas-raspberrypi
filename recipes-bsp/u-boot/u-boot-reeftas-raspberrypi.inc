BOOTENV_SIZE ??= "0x20000"
BOOTENV_SIZE[doc] = "Size of bootloader environment"

BOOTENV_RANGE ??= ""
BOOTENV_RANGE[doc] = "Range occupied by bootloader environment"

DEPLOYDIR = "${WORKDIR}/deploy-${PN}"

################################################################################
# Generic patches.
################################################################################
FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"

#SRC_URI_append = " file://0001-Enable-CONFIG_BCM283X_MU_SERIAL-for-uart-on-RPi3.patch"
