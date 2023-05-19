(ns metabase.driver.clickhouse-nippy
  (:require [taoensso.nippy :as nippy])
  (:import  [java.io DataInput DataOutput]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; com.clickhouse.data.value.UnsignedByte
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(nippy/extend-freeze com.clickhouse.data.value.UnsignedByte :clickhouse/UnsignedByte
                     [^com.clickhouse.data.value.UnsignedByte x ^DataOutput data-output]
                     (nippy/freeze-to-out! data-output (.toString x)))

(nippy/extend-thaw :clickhouse/UnsignedByte
                   [^DataInput data-input]
                   (com.clickhouse.data.value.UnsignedByte/valueOf (nippy/thaw-from-in! data-input)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; com.clickhouse.data.value.UnsignedShort
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(nippy/extend-freeze com.clickhouse.data.value.UnsignedShort :clickhouse/UnsignedShort
                     [^com.clickhouse.data.value.UnsignedShort x ^DataOutput data-output]
                     (nippy/freeze-to-out! data-output (.toString x)))

(nippy/extend-thaw :clickhouse/UnsignedShort
                   [^DataInput data-input]
                   (com.clickhouse.data.value.UnsignedShort/valueOf (nippy/thaw-from-in! data-input)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; com.clickhouse.data.value.UnsignedInteger
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(nippy/extend-freeze com.clickhouse.data.value.UnsignedInteger :clickhouse/UnsignedInteger
                     [^com.clickhouse.data.value.UnsignedInteger x ^DataOutput data-output]
                     (nippy/freeze-to-out! data-output (.toString x)))

(nippy/extend-thaw :clickhouse/UnsignedInteger
                   [^DataInput data-input]
                   (com.clickhouse.data.value.UnsignedInteger/valueOf (nippy/thaw-from-in! data-input)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; com.clickhouse.data.value.UnsignedLong
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(nippy/extend-freeze com.clickhouse.data.value.UnsignedLong :clickhouse/UnsignedLong
                     [^com.clickhouse.data.value.UnsignedLong x ^DataOutput data-output]
                     (nippy/freeze-to-out! data-output (.toString x)))

(nippy/extend-thaw :clickhouse/UnsignedLong
                   [^DataInput data-input]
                   (com.clickhouse.data.value.UnsignedLong/valueOf (nippy/thaw-from-in! data-input)))
