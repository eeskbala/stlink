configure_file(
	"${PROJECT_SOURCE_DIR}/include/stlink/version.h.in"
	"${CMAKE_BINARY_DIR}/include/stlink/version.h"
)
file(GLOB STLINK_HEADERS
	"stlink/*.h"
	"${CMAKE_BINARY_DIR}/include/stlink/*.h"
)
