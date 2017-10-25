package idea.plugin.jmeter;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public class JmeterFileTypeFactory extends FileTypeFactory {
	
	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(JmeterFileType.INSTANCE);
	}

}
