package org.lineageos.selfie

import androidx.camera.view.CameraController
import org.lineageos.selfie.utils.PhysicalCamera

@androidx.camera.camera2.interop.ExperimentalCamera2Interop
internal fun CameraController.physicalCamera(): PhysicalCamera? {
    return cameraInfo?.let { PhysicalCamera(it) }
}
