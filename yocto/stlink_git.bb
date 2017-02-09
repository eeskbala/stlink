DESCRIPTION = "STLINK V2 Texane"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit cmake

PR = "r0"

SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/eeskbala/stlink.git;branch=master"

S = "${WORKDIR}/git"
BBCLASSEXTEND = "native"
