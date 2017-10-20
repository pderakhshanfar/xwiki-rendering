// This test is automatically generated  by EvoCrash for issue XRENDERING-422.
// bug report: https://jira.xwiki.org/browse/XRENDERING-422
// target Frame : 4
// target class: EmptyBlockChainingListener
// target method: endformat()
// version: 7.3

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

public class EmptyBlockChainingListenerFrame2Test
{

  @Test(timeout = 4000)
  public void test()  {
    ListenerChain listenerChain0 = new ListenerChain();
    EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
    Format format0 = Format.NONE;
    HashMap<String, String> hashMap0 = new HashMap<String, String>();
    emptyBlockChainingListener0.endFormat(format0, hashMap0);
}

}
