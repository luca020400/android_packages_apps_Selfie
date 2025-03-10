package org.lineageos.selfie

import androidx.camera.core.CameraSelector
import androidx.camera.extensions.ExtensionMode
import androidx.camera.extensions.ExtensionsManager

val extensionModes = IntProgression.fromClosedRange(ExtensionMode.NONE, ExtensionMode.AUTO, 1)

internal fun ExtensionsManager.getSupportedModes(cameraSelector: CameraSelector) =
    extensionModes.filter { isExtensionAvailable(cameraSelector, it) }
