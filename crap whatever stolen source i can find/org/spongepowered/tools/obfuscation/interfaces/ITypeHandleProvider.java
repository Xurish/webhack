package org.spongepowered.tools.obfuscation.interfaces;

import javax.lang.model.type.TypeMirror;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

public interface ITypeHandleProvider {
  TypeHandle getTypeHandle(String paramString);
  
  TypeHandle getSimulatedHandle(String paramString, TypeMirror paramTypeMirror);
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\org\spongepowered\tools\obfuscation\interfaces\ITypeHandleProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */