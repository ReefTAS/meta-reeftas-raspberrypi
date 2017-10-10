SUMMARY = "Reef Tank Automation System - ReefTAS For Raspberry Pi"
HOMEPAGE = ""
LICENSE = "Apache-2.0"

include recipes-core/images/reeftas-base.bb

DEPENDS += "bcm2835-bootfiles"

WIFI_SUPPORT = " \
    crda \
    iw \
    linux-firmware-brcm43430 \
    linux-firmware-ralink \
    linux-firmware-rtl8192ce \
    linux-firmware-rtl8192cu \
    linux-firmware-rtl8192su \
    wireless-tools \
    wpa-supplicant \
 "

RPI_STUFF = " \
    rpio \
    rpi-gpio \
    userland \
    wiringpi \
 "

IMAGE_INSTALL += " \
    ${RPI_STUFF} \
    ${WIFI_SUPPORT} \
"

export IMAGE_BASENAME = "reeftas-image-raspberrypi"
